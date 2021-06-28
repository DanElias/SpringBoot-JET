import React, { Component } from 'react';
import SingleContact from './SingleContact';
import AddContacts from  './AddContacts';

// state in react holds the the data to be used by the components

export default class Contacts extends Component {
    constructor(props) {
        super(props);
        this.state = {
            contacts: [],
        }
    }

     //Method that runs before the component renders on ui
     // fetch data before rendering
    componentDidMount() {
        fetch('http:localhost:8080/api/contacts') //fetch data from api
        .then(response => response.json()) // convert to json
        .then(data => this.setState({contacts: data})) // set the state with new data
    }
   

    render() {
        return (
            <div>
                <div className="row">
                    <AddContacts />
                </div>
                <div className="row">
                    {this.state.contacts.map((item) => (
                        <SingleContact key={item.id} item={item}/>
                    ))}
                </div>
            </div>
        )   
    }
}