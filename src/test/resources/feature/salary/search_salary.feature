#language:pt
#como está em português, o .0 é substituido por ,0. Veja linha 3
@Salary
Funcionalidade: Gestão de Salários
 
  Cenario: Modificar um salário de empregado
    Dado o sistema de gestão de salários é inicializado com os seguintes dados
      | id  | user      | salary   |
      | 1   | donald    | 600000  |
      | 2   | dewie     | 62000  |
      | 3   | goofy     | 55000,0  |
      | 4   | scrooge   | 70000  |
      | 5   | daisy     | 56000  |
      | 6   | minnie    | 62000  |
      | 7   | mickey    | 51000  |
      | 8   | fethry    | 66500  |
    Quando o chefe chefe aumenta o salário do empregado com id '3' para 5%
    Então o pagamento do o empregado com id '3' deve mostrar o salário de 57750