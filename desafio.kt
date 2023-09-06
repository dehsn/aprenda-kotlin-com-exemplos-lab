enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

enum class Genero { M, F, OUTRO }

data class Usuario(val id: String, val nome: String, val genero: Genero) 

data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
   
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} ID ${usuario.id} matriculado com sucesso!")
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução ao Git e GitHub", 120, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Pensamento Computacional", 90, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Introdução ao Kotlin", 120, Nivel.DIFICIL)
    val estudante1 = Usuario("1", "Jonathan", Genero.M) 
    val estudante2 = Usuario("2", "Regina", Genero.F)
    val estudante3 = Usuario("3", "Ariel", Genero.OUTRO)
    val formacao1 = Formacao("Dev Kotlin", listOf(conteudo1, conteudo2, conteudo3))
    
    formacao1.matricular(estudante1)
    formacao1.matricular(estudante2)
    formacao1.matricular(estudante3)
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}