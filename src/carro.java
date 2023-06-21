class carro {
    private String marca;
    private int ano;
    private double valor;
    private String cor;
    private int portas;
    private int velocidade;

    public carro(String marca, int ano,double valor, String cor, int portas, int velocidade) {

    }
 // Get e Set


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void partida() {
        System.out.println("Iniciando o motor... minha velocidade está em " + velocidade + " km/h");
    }

    public void frear() {
        System.out.println("Freando... minha velocidade está em " + velocidade + " km/h");
    }

    public void acelerar() {
        System.out.println("Acelerando... minha velocidade está em " + velocidade + " km/h");
    }
}
