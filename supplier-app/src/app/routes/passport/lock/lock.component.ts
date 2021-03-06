import {Router} from '@angular/router';
import {Component} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {SettingsService} from '@delon/theme';

@Component({
  selector: 'passport-lock',
  templateUrl: './lock.component.html',
})
export class UserLockComponent {
  f: FormGroup;

  constructor(
    public settings: SettingsService,
    fb: FormBuilder,
    private router: Router,
  ) {
    this.f = fb.group({
      password: [null, Validators.required],
    });
  }

  submit() {
    // tslint:disable-next-line:forin
    for (const i in this.f.controls) {
      this.f.controls[i].markAsDirty();
      this.f.controls[i].updateValueAndValidity();
    }
    if (this.f.valid) {
      this.router.navigate(['dashboard']);
    }
  }
}
