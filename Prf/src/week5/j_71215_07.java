package week5;

interface _A{}
interface _B{}
interface _C extends _A {}
interface _D extends _A, _B {}	//인터페이스 다중상속 가능

class _E{}
class _F extends _E {}
//class G extends E, F {}	//클래스 다중상속 X
class _H implements _A {}
class _I implements _A, _B {}

class _J extends _E implements _A, _B {}
//class _K implements _A extends _E {}	//클래스 상속 후 인터페이스를 상속 해야 함.
//interface _L impliments _E {}	//인터페이스는 class를 부모로 두지 않는다.

public class j_71215_07 {

}
