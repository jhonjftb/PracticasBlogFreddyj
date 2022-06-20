require_once("car.php");
require_once(UberX.php);
require_once(Account.php);

$UberX = new UberX("AW456", new Account("Andres Herrera", "AMS123"), "Chevrolet", "Sparks");
$UberX->printDataCar();

php -S localhost:8080 index.php