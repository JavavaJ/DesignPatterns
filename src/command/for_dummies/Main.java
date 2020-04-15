package command.for_dummies;

import command.for_dummies.command.RebootCommand;
import command.for_dummies.command.RunDiagnosticsCommand;
import command.for_dummies.command.ShutDownCommand;
import command.for_dummies.receiver.AsiaServer;
import command.for_dummies.receiver.EuroServer;
import command.for_dummies.receiver.USServer;

public class Main {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        AsiaServer asiaServer = new AsiaServer();
        EuroServer euroServer = new EuroServer();
        USServer usServer = new USServer();

        ShutDownCommand shutDownAsia = new ShutDownCommand(asiaServer);
        RunDiagnosticsCommand runDiagnosticsAsia = new RunDiagnosticsCommand(asiaServer);
        RebootCommand rebootAsia = new RebootCommand(asiaServer);

        ShutDownCommand shutDownEuro = new ShutDownCommand(euroServer);
        RunDiagnosticsCommand runDiagnosticsEuro = new RunDiagnosticsCommand(euroServer);
        RebootCommand rebootEuro = new RebootCommand(euroServer);

        ShutDownCommand shutDownUS = new ShutDownCommand(usServer);
        RunDiagnosticsCommand runDiagnosticsUS = new RunDiagnosticsCommand(usServer);
        RebootCommand rebootUS = new RebootCommand(usServer);

        invoker.setCommand(shutDownAsia);
        invoker.run();

        invoker.setCommand(rebootAsia);
        invoker.run();

        invoker.setCommand(runDiagnosticsAsia);
        invoker.run();

        invoker.setCommand(shutDownEuro);
        invoker.run();

        invoker.setCommand(runDiagnosticsEuro);
        invoker.run();

    }

}
