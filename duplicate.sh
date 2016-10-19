cp -r empty $1
cd $1
#mv empty.iml $1.iml
sed s/empty/$1/g pom.xml > pom.xml1 && mv pom.xml1 pom.xml
