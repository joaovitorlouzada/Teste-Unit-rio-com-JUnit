# Teste-Unitário-com-JUnit

🛠️  O que é o JUnit?

O JUnit é um framework de testes para a linguagem Java, usado principalmente para escrever e rodar testes automatizados de unidades de código. Ele facilita a verificação de que partes específicas do programa (como métodos e classes) estão funcionando corretamente, permitindo detectar e corrigir erros mais rapidamente durante o desenvolvimento. É amplamente utilizado em práticas de desenvolvimento orientadas a testes, como o TDD (Test-Driven Development). Com o JUnit, você pode testar métodos e classes diretamente, sem precisar executar o programa inteiro com um método main. Isso torna os testes mais rápidos, práticos e focados em partes específicas do código.

💡 Entendendo o Exemplo

O exemplo em questão é um Projeto chamado BigMercados que simula um sistema de supermecados genérico. Porém, o foco dos teste se dará na classe Venda e a classe ItemVenda (relação de composição). Para realizar os testes, também temos que importar suas dependencias presentes no pacote de enumerados. Segue o diagrama de classes: 

![image](https://github.com/user-attachments/assets/272f45b6-7a1f-4344-8d02-3cfcb46e376d)

A partir dessas classes, podemos então, criar o pacote de testes e nele criar nosso arquivo de tipo JUnit Test Case. É nele em que instanciamos os objetos da classe Venda e ItemVenda para testar os seus métodos de total e subtotal utilizando a assertiva assertEquals. Por fim, testamos também a impressão do cupom fiscal. 

⭐ Vantagens de Utilizar o JUnit

✅ Automatização dos testes – Permite executar testes de forma rápida e repetida, economizando tempo.

🔍 Foco em partes específicas do código – Facilita a verificação de métodos e classes individualmente.

⚠️ Detecção precoce de erros – Ajuda a identificar bugs logo nas fases iniciais do desenvolvimento.

🔄 Facilidade para aplicar TDD – Integra bem com práticas como o Test-Driven Development.

🧪 Integração com outras ferramentas – Funciona bem com IDEs, ferramentas de build (como Maven e Gradle) e pipelines de CI/CD.
