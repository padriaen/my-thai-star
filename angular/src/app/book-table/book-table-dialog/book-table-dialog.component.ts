import { MdDialogRef, MdSnackBar } from '@angular/material';
import { Component, OnInit, Inject } from '@angular/core';
import { BookTableService } from '../shared/book-table.service';
import { ReservationView } from '../../shared/models/interfaces';
import {MD_DIALOG_DATA} from '@angular/material';
import * as moment from 'moment';

@Component({
  selector: 'public-book-table-dialog',
  templateUrl: './book-table-dialog.component.html',
  styleUrls: ['./book-table-dialog.component.scss'],
})
export class BookTableDialogComponent implements OnInit {

  data: ReservationView;

  constructor (public snackBar: MdSnackBar,
               public bookingService: BookTableService,
               private dialog: MdDialogRef<BookTableDialogComponent>,
               @Inject(MD_DIALOG_DATA) dialogData: any) {
                 this.data = dialogData;
  }

  ngOnInit(): void {
    this.data.dateTime = moment(this.data.dateTime).format('LLL');
    this.bookingService.getTableId().subscribe( (bookingId: number) => {
      this.data.bookingId = bookingId;
    });
  }

  sendBooking (): void {
    this.data.orders = [];
    this.data.friends = [];
    this.bookingService.postBookingTable(this.data).subscribe( () => {
      this.snackBar.open('Table succesfully booked', 'OK', {
        duration: 7000,
      });
    });
    this.dialog.close(true);
  }

}
