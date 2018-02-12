package java3;

public class PrintMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OraclePrint oraclePrint = new OraclePrint();
//		MySQLPrint mySQLPrint = new MySQLPrint();
//		MongoDBPrint mongoDBPrint = new MongoDBPrint();
//		
//		oraclePrint.print();
//		mySQLPrint.print();
//		mongoDBPrint.print();
		
		print(oraclePrint);
		
		//Oracle 출력
		print(new OraclePrint());
		//MySQL 출력
		print(new MySQLPrint());
		//MongoDB 출력
		print(new MongoDBPrint());
	}
	
	//인터페이스를 이용해서 동작시키는 메서드
	public static void print(DBPrint dbPrint) {
		dbPrint.print();
	}

}
