
import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { Router } from '@angular/router';
import { NzMessageService, NzModalService } from 'ng-zorro-antd';
import { NationalGroup } from '../../../models/original/national-group.model';
import { NationalGroupService } from '../../../services/national-group.service';
import { SUCCESS } from '../../../models/constants.model';

@Component({
    selector: 'add-national-group',
    templateUrl: './add-national-group.component.html',
    styleUrls: ['./add-national-group.component.scss'],
    encapsulation: ViewEncapsulation.None
})
export class AddNationalGroupComponent implements OnInit {

    submitting = false;

    nationalGroup: NationalGroup;

    constructor(private router:Router,private nationalGroupService: NationalGroupService, public msgSrv: NzMessageService,
        private modalService: NzModalService) {
    }

    ngOnInit() {
    }

    onTransmitFormValueSubscription(event) {
        if (event) {
            this.confirmSub(event)
        }
    }

    confirmSub(formValue){
        if (formValue) {
            this.submitting = true;
            const messageId = this.msgSrv.loading("正在提交...").messageId;
            this.nationalGroupService.add(formValue.obj).subscribe(response => {
                if (response.result == SUCCESS) {
                    this.msgSrv.success("操作成功");
                    this.router.navigate(['/dashboard/national-group/list']);
                } else {
                    this.msgSrv.error('请求失败'+response.message);
                }
                this.msgSrv.remove(messageId);
                this.submitting = false;
            }, error => {
                this.msgSrv.error('请求错误'+error.message);
                this.msgSrv.remove(messageId);
                this.submitting = false;
            });
        }
    }

}
