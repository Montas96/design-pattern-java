package com.umbrella.designpattern.solid.isp;

class MultiFunctionMachine implements MultiFunctionDevice {
    // compose this out of several modules
    private final Printer printer;
    private final IScanner scanner;

    public MultiFunctionMachine(Printer printer, IScanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    public void Print(Document d) throws Exception {
        printer.Print(d);
    }

    public void Scan(Document d) throws Exception {
        scanner.Scan(d);
    }
}
