package ru.job4j.ood.isp;

public interface Employee {
        void testSoftware();
        void design();
        void code();
}

/*
Нарушение принципа ISP заключается в неправильном выделение абстракции,
разные реализации (сотрудники) выполняют конкретную
работу, и всю работу выполнять не нужно.
 */
