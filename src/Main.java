// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        carro renault = new Renault("Renault", 2015, 26000.0, "Preto", 4, 0);
        renault.partida(); // Saída esperada: Iniciando o motor... minha velocidade está em 0 km/h
        renault.frear(); // Saída esperada: Freando... minha velocidade está em -5 km/h
        renault.acelerar(); // Saída esperada: Acelerando... minha velocidade está em 5 km/h

        carro fiat = new Fiat("Fiat", 2022, 45000.0, "Vermelho", 4, 0);
        fiat.partida(); // Saída esperada: Iniciando o motor... minha velocidade está em 3 km/h
        fiat.frear(); // Saída esperada: Freando... minha velocidade está em -3 km/h
        fiat.acelerar(); // Saída esperada: Acelerando... minha velocidade está em 9 km/h

        carro hyundai = new Hyundai("Hyundai", 2023, 90000.0, "Prata", 4, 0);
        hyundai.partida(); // Saída esperada: Iniciando o motor... minha velocidade está em 5 km/h
        hyundai.frear(); // Saída esperada: Freando... minha velocidade está em 3 km/h
        hyundai.acelerar(); // Saída esperada: Acelerando... minha velocidade está em 18 km/h
    }
}

