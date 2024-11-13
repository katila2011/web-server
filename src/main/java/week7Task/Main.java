package week7Task;

import week7Task.service.HttpServerServiceImpl;

import static week7Task.general.SimpleHttpServer.PORT;

public class Main {
    public static void main(String[] args) {
        HttpServerServiceImpl service = new HttpServerServiceImpl();

        service.start(PORT);
    }
}
