import React from 'react';
import './App.css';
import Card from './components/Card';

// functional component
// props -> singular argument passed to a component
//       -> object that contain all the values you're looking to pass
const FuncGreeting = (props) => {
  //props.name = "new name"; // can't be done, read only
  return <p>Hello {props.name}</p>
}

// class component
/* props = { name: "some name" } */
class ClassGreeting extends React.Component {

  render() {
    return <p>Hello {this.props.name} </p>
  }
}
// <Component arg="some string">
// Java => Component comp1 = new Component("some string")
function App() {
  return (
    <div className="container">
      
      <h1 className="display-2">React Example Project</h1>
      <hr/>

      {/* COMPONENTS */}

      <h3>Components</h3>
      <FuncGreeting name="World"/> 
      <FuncGreeting name="Orquidia" />
      <ClassGreeting name="Pheonix" />
      { FuncGreeting("") }

      <Card url="https://www.independent.ie/lifestyle/33525/30179868.ece/AUTOCROP/h530/HEA_2014-04-14_LIF_008_31207881_I1.JPG" title="Peppa Pig" text="She's like 7 ft tall."/>

    </div>
  );
}

export default App;
