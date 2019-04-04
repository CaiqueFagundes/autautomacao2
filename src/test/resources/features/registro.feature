# language: pt
Funcionalidade: Registro

  @Registro
  Cenario: Realizar Registro
    Dado que eu esteja  na tela de registro
    Quando faço o preenchimento das informações da tela de Register
      |  User name | Login     | Password  |
      | Caique     | Kaiq_SG1  | Aol@19rfl | 
      
    Então sou registrado com sucesso
