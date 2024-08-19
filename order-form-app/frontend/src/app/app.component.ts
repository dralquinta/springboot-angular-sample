import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  orderForm = {
    tipoPedido: 1,
    resp: false
  };

  constructor(private http: HttpClient) {}

  submitOrder() {
    this.http.post('/submit-order', this.orderForm).subscribe(
      response => {
        console.log('Order submitted successfully!', response);
        // You can add further actions here, like resetting the form or showing a success message
      },
      error => {
        console.error('Error submitting order:', error);
        // Handle the error appropriately, e.g., display an error message to the user
      }
    );
  }
}