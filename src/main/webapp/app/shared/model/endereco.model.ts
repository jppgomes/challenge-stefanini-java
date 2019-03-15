import { IPessoa } from 'app/shared/model/pessoa.model';

export interface IEndereco {
    id?: number;
    logradouro?: string;
    bairro?: string;
    cidade?: string;
    estado?: string;
    pessoa?: IPessoa;
}

export class Endereco implements IEndereco {
    constructor(
        public id?: number,
        public logradouro?: string,
        public bairro?: string,
        public cidade?: string,
        public estado?: string,
        public pessoa?: IPessoa
    ) {}
}
