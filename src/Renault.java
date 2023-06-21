class Renault extends carro {
    public Renault(String marca, int ano, double valor, String cor, int portas, int velocidade) {
        super(marca, ano, valor, cor, portas, velocidade);
    }

    @Override
    public void partida() {
        setVelocidade(0);
        System.out.println("Iniciando o motor... minha velocidade está em " + getVelocidade() + " km/h");
    }

    @Override
    public void frear() {
        setVelocidade(getVelocidade() - 5);
        System.out.println("Freando... minha velocidade está em " + getVelocidade() + " km/h");
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 10);
        System.out.println("Acelerando... minha velocidade está em " + getVelocidade() + " km/h");
    }



}
