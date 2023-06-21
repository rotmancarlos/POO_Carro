class Hyundai extends carro {
    public Hyundai(String marca, int ano, double valor, String cor, int portas, int velocidade) {
        super(marca, ano, valor, cor, portas, velocidade);
    }

    @Override
    public void partida() {
        setVelocidade(5);
        System.out.println("Iniciando o motor... minha velocidade está em " + getVelocidade() + " km/h");
    }

    @Override
    public void frear() {
        setVelocidade(getVelocidade() - 2);
        System.out.println("Freando... minha velocidade está em " + getVelocidade() + " km/h");
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 15);
        System.out.println("Acelerando... minha velocidade está em " + getVelocidade() + " km/h");
    }

}
