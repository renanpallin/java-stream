## Java Streams Test
Este é um projeto de teste feito em java. Constitui de apenas uma classe com um método público relevante, o findChar(Stream stream), que retorna o caractere que atende todas as condições abaixo:

> Dada uma stream, encontre o primeiro caractere Vogal, após uma consoante, onde a mesma é antecessora a uma vogal e que não se repita no resto da stream. O termino da leitura da stream deve ser garantido através do método hasNext(), ou seja, retorna falso para o termino da leitura da stream. Voce tera acesso a leitura da stream através dos métodos de interface fornecidos ao termino do enunciado.

Caso não seja encontrado tal caractere, o sistema retorna uma menságem amigável.
Existe uma classe de teste implementada com o JUnity - unico framework utilizado no projeto - cujo resultados são demonstrados na tabela abaixo:

| Input         | Output        |
| ------------- | ------------- |
| "aAbBABacafe" | "e" |
| "aAbBABacafevilo" | "e" |
| "abA" | "A" |
| "rtytd" | `mensagemAmigavel` |
| "" | `mensagemAmigavel` |
| "aAbBABacafeabagsdfaged" | `mensagemAmigavel` |
| "aAbBokuABacafe" | "u" |

`mensagemAmigavel` = "Não foi encontrado nenhuma sequência de caracteres com as caracteríscticas necessárias =("


### Executando o projeto
É um maven project com apenas o JUnity como dependência, você pode importar na sua IDE favorita com algo como "Imoprt Maven Project".

### Autor
Renan Pallin \<renanpallin@gmail.com\>
