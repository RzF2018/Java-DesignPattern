####单例模式(Singleton Pattern)
 
######创建型模式，负责创建自己的对象，同时确保只有单个对象被创建

* 单例模式产生的目的
######控制实例数目，节省系统资源
* 单例模式解决的问题
######解决全局类频繁创建和销毁带来的资源损耗问题
* 关键代码
######构造函数私有化
* 优点
######内存中只有一个实例，减少内存开销
######避免对资源的多重占用
* 缺点
######没有接口，不能继承，与单一职责原则冲突(类只关心内部逻辑，不关心外部如何实例化)
* 使用场景
######产生唯一序列号
######WEB中的计数器
######创建一个对象需要消耗资源过多(I/O与数据库连接)时使用



