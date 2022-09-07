import React from 'react';
import axios from 'axios';
import {Button, TextField} from "@mui/material";

class ContactAdd extends React.Component {
  state = {
    nom: ''
  }

  handleSubmit = event => {
    event.preventDefault();
      alert('Form Submitted');
      event.preventDefault();

    let contact = {
      nom: event.target[0].value,
      adresse: event.target[1].value,
      ville: event.target[2].value,
      pays : event.target[3].value,
        telephone :event.target[4].value,
      debutContrat :event.target[5].value

    };
    console.log(contact)
    axios.post(`http://localhost:8080/contact`,  contact )
      .then(res => {
        console.log(res);
        console.log(res.data);
      })
  }

  render() {
    return (
      <div>
        <form onSubmit={this.handleSubmit}>

          <table>
        <tr>    <label>
                  Contact
              </label></tr>
              <tr>Name:
           <td> <input type="text" name="nom"   pattern='[a-zA-Z]*' required/></td>
           </tr>
            <tr>Adresse:
              <td> <input  type="email" name="adresse" required/></td>
            </tr>
            <tr>Ville:
              <td> <input  type="text" name="ville" pattern='[a-zA-Z]*' required/></td>
            </tr>
            <tr>Pays:
              <td> <input  type="text" name="pays" pattern='[a-zA-Z]*' required/></td>
            </tr>
            <tr>Téléphone:
              <td> <input  type="text"  name="telephone" required /></td>
            </tr>
            <tr>Début Contrat:
              <td> <input  type="date" name="debutContrat" required/></td>
            </tr>


          {/*<button type="submit">Add</button>*/}
       <tr>    <Button variant="contained" color="primary" type={"submit"}>
            confirmer
         </Button>
       <td>   <Button variant="contained" color="primary" type={"reset"}>
            annuler
            </Button></td></tr>
          </table>
        </form>
      </div>
    )
  }
}
export default ContactAdd
