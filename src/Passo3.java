public class Passo3 {
    
    
    public interface AnimalIF {
        void comer(int quantidadeComida);
        void moverse(int distancia);
        void dormir(int horas);
    }
    
    
    public abstract static class AnimalAB implements AnimalIF {
        protected int quantidadeComida; 
        protected int distanciaPercorrida;
        protected int horasDeSono; 
         
        public abstract void comer(int quantidadeComida);
        
    
        public abstract void moverse(int distancia);
        
        public abstract void dormir(int horas);
        
        public int getQuantidadeComida() {
            return quantidadeComida;
        }
        
        public int getDistanciaPercorrida() {
            return distanciaPercorrida;
        }
        
        public int getHorasDeSono() {
            return horasDeSono;
        }
    }
    
    
    public static class Cachorro extends AnimalAB {
        
        public void comer(int quantidadeComida) {
            this.quantidadeComida += quantidadeComida;
            System.out.println("O cachorro comeu " + quantidadeComida + " unidades de comida.");
        }

        
        public void moverse(int distancia) {
            this.distanciaPercorrida += distancia;
            System.out.println("O cachorro percorreu " + distancia + " metros.");
        }

        
        public void dormir(int horas) {
            this.horasDeSono += horas;
            System.out.println("O cachorro dormiu por " + horas + " horas.");
        }
    
    }
    
    
    
    public static class Gato extends AnimalAB {
        
        public void comer(int quantidadeComida) {
            this.quantidadeComida += quantidadeComida;
            System.out.println("O gato comeu " + quantidadeComida + " unidades de comida.");
        }

        
        public void moverse(int distancia) {
            this.distanciaPercorrida += distancia;
            System.out.println("O gato percorreu " + distancia + " metros.");
        }

        
        public void dormir(int horas) {
            this.horasDeSono += horas;
            System.out.println("O gato dormiu por " + horas + " horas.");
        }
    }
    
    
    public static class Elefante extends AnimalAB {
        
        public void comer(int quantidadeComida) {
            this.quantidadeComida += quantidadeComida;
            System.out.println("O elefante comeu " + quantidadeComida + " unidades de comida.");
        }

        
        public void moverse(int distancia) {
            this.distanciaPercorrida += distancia;
            System.out.println("O elefante percorreu " + distancia + " metros.");
        }

        
        public void dormir(int horas) {
            this.horasDeSono += horas;
            System.out.println("O elefante dormiu por " + horas + " horas.");
        }
    }
    
    
    public static class Leão extends AnimalAB {
        
        public void comer(int quantidadeComida) {
            this.quantidadeComida += quantidadeComida;
            System.out.println("O leão comeu " + quantidadeComida + " unidades de comida.");
        }

        
        public void moverse(int distancia) {
            this.distanciaPercorrida += distancia;
            System.out.println("O leão percorreu " + distancia + " metros.");
        }

        
        public void dormir(int horas) {
            this.horasDeSono += horas;
            System.out.println("O leão dormiu por " + horas + " horas.");
        }
    }
    
}
