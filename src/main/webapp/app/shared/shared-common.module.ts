import { NgModule } from '@angular/core';

import { SwaggerSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [SwaggerSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [SwaggerSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class SwaggerSharedCommonModule {}
