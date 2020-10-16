# ManualObserverDemo
## 手写观察者模式

主要有`addObserver`、`setChanged`、`notifyObservers`方法

被观察者持有观察者的对象

采用集合的方式保存所有的观察者

数据发生改变时，调用`notifyObservers`方法来通知观察者

--- 
### 参考博客
-  https://blog.csdn.net/qq_35571554/article/details/82769758