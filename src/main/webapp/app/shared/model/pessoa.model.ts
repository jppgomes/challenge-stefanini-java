import { IEndereco } from 'app/shared/model/endereco.model';

export interface IPessoa {
    id?: number;
    nome?: string;
    sobrenome?: string;
    cpf?: string;
    email?: string;
    enderecos?: IEndereco[];
}

export class Pessoa implements IPessoa {
    constructor(
        public id?: number,
        public nome?: string,
        public sobrenome?: string,
        public cpf?: string,
        public email?: string,
        public enderecos?: IEndereco[]
    ) {}
}
