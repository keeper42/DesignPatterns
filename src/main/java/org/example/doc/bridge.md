桥接模式就是“将抽象和实现解耦，让它们可以独立地组合变化”。
JDBC 驱动是桥接模式的经典应用。
JDBC 本身就相当于“抽象”；具体的 Driver（比如，com.mysql.jdbc.Driver）就相当于“实现”。
JDBC 和 Driver 独立开发，通过对象之间的组合关系，组装在一起。
JDBC 中的逻辑操作，最终都委托给 Driver 来执行。