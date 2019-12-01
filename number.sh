echo "Enter Number 1"
read a
echo "Enter Number 2"
read b
echo "Enter Number 3"
read c

if [ $a -gt $b -a $a -gt $c ]
then
echo "Great A"

elif [ $b -gt $a -a $b -gt $c ]
then 
echo "Great B"

elif [ $c -gt $a -a $c -gt $b ]
then 
echo "Great C"

fi