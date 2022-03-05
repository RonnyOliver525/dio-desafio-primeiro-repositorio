package com.company.Herancaex;

class RodarAplicativo  {

        public static void main(String[] args) {

            Funcionario funcionario = new Funcionario();

            Funcionario gerente = new Gerente();
            Funcionario vendedor = new Vendedor ();
            Funcionario faxineiro = new Faxineiro();

            //Gerente gerente = new Funcionario();
            //downcast implícito que provocará erro acima, explícito (obrigatório ser explícito) abaixo:
            //abaixo apresentará o erro de ClassCast pelo fato de haver informações perdidas
            //somente na subclasse Vendedor e por não saber o que fazer com estas informações
            //o Compilador apresenta este erro!
            //Vendedor vendedor = (Vendedor) new Funcionario();
        }
}
