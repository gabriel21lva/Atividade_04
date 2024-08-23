public class Passo2 {
    
    
    public interface AnimalIF {
        void comer();
        void moverse();
        void dormir();
    }
    
    public abstract static class AnimalAB implements AnimalIF {
        
        public void fazerSom() {
            System.out.println("O animal está fazendo um som.");
        }
        
        
        public abstract void comer();
         
        public abstract void moverse();
        
        public abstract void dormir();
    }
    
    }
    
