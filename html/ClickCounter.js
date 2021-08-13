import React, { Component } from 'react';

// For a long time the only type of component that could maintain a
// state was a class component

// click on a button and it'll increment the number on the screen
class ClickCounter extends Component {

    constructor(props) {
        super();
        this.state = {
            counter: 0
        }
        // it doesn't see that this is a function that belongs to
        // this class ('this' keyword works when callback is used)
        this.incrementCounter = this.incrementCounter.bind(this);
    }

    incrementCounter() {

        // when changing the state value, this ONLY changes the value
        // it is not causing a rerender
        //this.state.counter = this.state.counter + 1;

        // setState -> change the value of the state and rerender
        //             the component
        this.setState( state => ({
            counter: state.counter + 1
        }) );
    }

    render() {
        return (
            <div>
                <p>Counter: {this.state.counter}</p>
                <button className="btn btn-primary"
                        onClick={this.incrementCounter} >
                    Increment
                </button>
            </div>
        );
    }
}

export default ClickCounter;