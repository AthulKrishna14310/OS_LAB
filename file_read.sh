input="/home/athul/Documents/OS_Studies/tst.txt"
echo "Enter the word "
read a
while IFS= read -r line
do

    if [ $a = $line ]
    then
        echo "Present"
    fi    
done < "$input"