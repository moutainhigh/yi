import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {FormsModule} from '@angular/forms';
import {Routes, RouterModule} from '@angular/router';

import {IonicModule} from '@ionic/angular';

import {GroupOrderDetailPage} from './group-order-detail.page';
import {ComponentsModule} from "../../components/components.module";
import {PipesModule} from "../../../pipes/pipes.module";

const routes: Routes = [
    {
        path: '',
        component: GroupOrderDetailPage
    }
];

@NgModule({
    imports: [
        CommonModule,
        FormsModule,
        IonicModule,
        ComponentsModule,
        PipesModule,
        RouterModule.forChild(routes)
    ],
    declarations: [GroupOrderDetailPage]
})
export class GroupOrderDetailPageModule {
}
