import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
    imports: [
        RouterModule.forChild([
            {
                path: 'pessoa',
                loadChildren: './pessoa/pessoa.module#SwaggerPessoaModule'
            },
            {
                path: 'endereco',
                loadChildren: './endereco/endereco.module#SwaggerEnderecoModule'
            },
            {
                path: 'pessoa',
                loadChildren: './pessoa/pessoa.module#SwaggerPessoaModule'
            }
            /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
        ])
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class SwaggerEntityModule {}
