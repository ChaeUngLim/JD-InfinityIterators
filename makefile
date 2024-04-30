all: clean build run

build:
	./gradlew build
	
run:
	java -jar ./build/libs/Pre_MiniProject-1.0-SNAPSHOT.jar

clean:
	./gradlew clean
