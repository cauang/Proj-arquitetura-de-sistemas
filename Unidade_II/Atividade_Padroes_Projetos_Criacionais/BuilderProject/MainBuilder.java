class Burger {
    private String carne;
    private String queijo;
    private boolean bacon;
    private String molho;

    private Burger(BurgerBuilder builder) {
        this.carne = builder.carne;
        this.queijo = builder.queijo;
        this.bacon = builder.bacon;
        this.molho = builder.molho;
    }

    public String toString() {
        return "Burger [Carne=" + carne + ", Queijo=" + queijo +
               ", Bacon=" + bacon + ", Molho=" + molho + "]";
    }

    // Classe Builder interna
    public static class BurgerBuilder {
        private String carne;
        private String queijo;
        private boolean bacon;
        private String molho;

        public BurgerBuilder setCarne(String carne) {
            this.carne = carne;
            return this;
        }

        public BurgerBuilder setQueijo(String queijo) {
            this.queijo = queijo;
            return this;
        }

        public BurgerBuilder setBacon(boolean bacon) {
            this.bacon = bacon;
            return this;
        }

        public BurgerBuilder setMolho(String molho) {
            this.molho = molho;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}

public class MainBuilder {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                            .setCarne("Frango")
                            .setQueijo("Mussarela")
                            .setBacon(true)
                            .setMolho("Barbecue")
                            .build();

        System.out.println(burger);
    }
}