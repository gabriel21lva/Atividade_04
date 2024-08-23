public class Passo5 {


    public interface AnimalIF {
        void comer(int quantidadeComida);
        void moverse(int distancia);
        void dormir(int horas);
    }

    
    public abstract static class AnimalAB implements AnimalIF {
        protected String nome;
        protected String tipo;
        protected int idade;
        protected String habitat;
        protected double altura;
        protected double peso;

        public AnimalAB(String nome, String tipo, int idade, String habitat, double altura, double peso) {
            this.nome = nome;
            this.tipo = tipo;
            this.idade = idade;
            this.habitat = habitat;
            this.altura = altura;
            this.peso = peso;
        }

        public abstract void comer(int quantidadeComida);

        
        public abstract void moverse(int distancia);

        
        public abstract void dormir(int horas);

        
        public String getNome() {
            return nome;
        }

        public String getTipo() {
            return tipo;
        }

        public int getIdade() {
            return idade;
        }

        public String getHabitat() {
            return habitat;
        }

        public double getAltura() {
            return altura;
        }

        public double getPeso() {
            return peso;
        }
    }

    
    public abstract static class AnimalTerrestreAB extends AnimalAB {
        protected int quantidadePatas;

        public AnimalTerrestreAB(String nome, String tipo, int idade, String habitat, double altura, double peso, int quantidadePatas) {
            super(nome, tipo, idade, habitat, altura, peso);
            this.quantidadePatas = quantidadePatas;
        }

        public int getQuantidadePatas() {
            return quantidadePatas;
        }
    }


    public abstract static class AnimalMarinhoAB extends AnimalAB {
        public AnimalMarinhoAB(String nome, String tipo, int idade, String habitat, double altura, double peso) {
            super(nome, tipo, idade, habitat, altura, peso);
        }

        public abstract void nadar(int distancia);
    }

    public abstract static class AnimalVoadorAB extends AnimalAB {
        protected int quantidadeAssas;
        protected double envergaduraAssa;

        public AnimalVoadorAB(String nome, String tipo, int idade, String habitat, double altura, double peso, int quantidadeAssas, double envergaduraAssa) {
            super(nome, tipo, idade, habitat, altura, peso);
            this.quantidadeAssas = quantidadeAssas;
            this.envergaduraAssa = envergaduraAssa;
        }

        public int getQuantidadeAssas() {
            return quantidadeAssas;
        }

        public double getEnvergaduraAssa() {
            return envergaduraAssa;
        }

        public abstract void voar(int distancia);
    }

    
    public static class Cachorro extends AnimalTerrestreAB {
        public Cachorro(String nome, int idade, String habitat, double altura, double peso) {
            super(nome, "Cachorro", idade, habitat, altura, peso, 4);
        }

        
        public void comer(int quantidadeComida) {
            System.out.println(nome + " comeu " + quantidadeComida + " unidades de comida.");
        }

        
        public void moverse(int distancia) {
            System.out.println(nome + " percorreu " + distancia + " metros.");
        }

        
        public void dormir(int horas) {
            System.out.println(nome + " dormiu por " + horas + " horas.");
        }
    }

    
    public static class Gato extends AnimalTerrestreAB {
        public Gato(String nome, int idade, String habitat, double altura, double peso) {
            super(nome, "Gato", idade, habitat, altura, peso, 4);
        }

        
        public void comer(int quantidadeComida) {
            System.out.println(nome + " comeu " + quantidadeComida + " unidades de comida.");
        }

        
        public void moverse(int distancia) {
            System.out.println(nome + " percorreu " + distancia + " metros.");
        }

        
        public void dormir(int horas) {
            System.out.println(nome + " dormiu por " + horas + " horas.");
        }
    }

    
    public static class Elefante extends AnimalTerrestreAB {
        public Elefante(String nome, int idade, String habitat, double altura, double peso) {
            super(nome, "Elefante", idade, habitat, altura, peso, 4);
        }

        
        public void comer(int quantidadeComida) {
            System.out.println(nome + " comeu " + quantidadeComida + " unidades de comida.");
        }

        
        public void moverse(int distancia) {
            System.out.println(nome + " percorreu " + distancia + " metros.");
        }

        
        public void dormir(int horas) {
            System.out.println(nome + " dormiu por " + horas + " horas.");
        }
    }

    
    public static class Leão extends AnimalTerrestreAB {
        public Leão(String nome, int idade, String habitat, double altura, double peso) {
            super(nome, "Leão", idade, habitat, altura, peso, 4);
        }

        
        public void comer(int quantidadeComida) {
            System.out.println(nome + " comeu " + quantidadeComida + " unidades de comida.");
        }

        
        public void moverse(int distancia) {
            System.out.println(nome + " percorreu " + distancia + " metros.");
        }

        
        public void dormir(int horas) {
            System.out.println(nome + " dormiu por " + horas + " horas.");
        }
    }

    
    public static class Peixe extends AnimalMarinhoAB {
        public Peixe(String nome, int idade, String habitat, double altura, double peso) {
            super(nome, "Peixe", idade, habitat, altura, peso);
        }

        
        public void comer(int quantidadeComida) {
            System.out.println(nome + " comeu " + quantidadeComida + " unidades de comida.");
        }

        
        public void moverse(int distancia) {
            nadar(distancia);
        }

        
        public void dormir(int horas) {
            System.out.println(nome + " dormiu por " + horas + " horas.");
        }

        
        public void nadar(int distancia) {
            System.out.println(nome + " nadou " + distancia + " metros.");
        }
    }

    
    public static class Pombo extends AnimalVoadorAB {
        public Pombo(String nome, int idade, String habitat, double altura, double peso, double envergaduraAssa) {
            super(nome, "Pombo", idade, habitat, altura, peso, 2, envergaduraAssa);
        }

        
        public void comer(int quantidadeComida) {
            System.out.println(nome + " comeu " + quantidadeComida + " unidades de comida.");
        }

        
        public void moverse(int distancia) {
            voar(distancia);
        }

        
        public void dormir(int horas) {
            System.out.println(nome + " dormiu por " + horas + " horas.");
        }

        
        public void voar(int distancia) {
            System.out.println(nome + " voou " + distancia + " metros.");
        }
    }

    
    public static void main(String[] args) {
        
        AnimalTerrestreAB cachorro = new Cachorro("Toto", 5, "Doméstico", 0.5, 20);
        cachorro.comer(5);
        cachorro.moverse(100);
        cachorro.dormir(8);

        System.out.println();
        AnimalTerrestreAB gato = new Gato("Xaninho", 3, "Doméstico", 0.3, 4);
        gato.comer(3);
        gato.moverse(50);
        gato.dormir(10);

        System.out.println();
        AnimalTerrestreAB elefante = new Elefante("Dumbo", 10, "Savanas", 3.5, 5000);
        elefante.comer(20);
        elefante.moverse(200);
        elefante.dormir(6);

        System.out.println();
        AnimalTerrestreAB leão = new Leão("Mufasa", 7, "Savanas", 1.2, 190);
        leão.comer(15);
        leão.moverse(150);
        leão.dormir(5);

        System.out.println();
        AnimalMarinhoAB peixe = new Peixe("Dory", 2, "Oceano", 0.1, 0.2);
        peixe.comer(10);
        peixe.moverse(50);
        peixe.dormir(6);

        System.out.println();
        AnimalVoadorAB pombo = new Pombo("Pombinho", 1, "Cidades", 0.2, 0.4, 0.5);
        pombo.comer(5);
        pombo.moverse(100);
        pombo.dormir(8);
    }
}
