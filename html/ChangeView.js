import React from 'react';

const Red = (props) => {
    return(
        <h4 style={ {color: 'red'} }>
            This text is red
        </h4>
    );
}

const Blue = (props) => {
    return(
        <h4 style={ {color: 'blue'} }>
            This text is blue
        </h4>
    );
}

const RemoveComponent = (props) => {
    if(props.remove) {
        return null;
    }
    else {
        return <Red/>
    }
}

const ChangeView = () => {
    return (
        <div>
            {/* Nulls don't get shown on a page in React */}
            { null }

            {
                5 > 0 ? // condition
                <Red/> : null
            }

            { <RemoveComponent remove={false} /> }

            {/*  condition && <Component/> -> if condition is true component will show, if false, not show  */}
            {
                true && <Blue/>
            }

        </div>
    );
};

export default ChangeView;