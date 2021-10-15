//Bài 1
function checkElementExist(array,number) {
    return array.includes(number);
}
console.log(checkElementExist([1,2,3,4,],5))
//Bài 2
function max2Numbers(array) {
    array.sort();
    return array[array.length -2];
}
console.log(max2Numbers([6,4,2,3]))
//Bài 3
function findMaxLengthElement(array) {
    let result=[];
    let lengthMax = array.map((i) => i.length).sort()[array.length - 1];

    array.find((i) => {
        if (i.length === lengthMax) {
            result.push(i);
        }
    });
    return result;
}
console.log(findMaxLengthElement(["aba", "aa", "ad", "c", "tung"]))
console.log(findMaxLengthElement(["aba", "aa", "ad", "c", "tun"]))
//Bài 4
function capitalizeString(string) {
    let array = string.toLowerCase().split(" ");
    return array.map((i) => `${i.charAt(0).toUpperCase()}${i.substr(1)}`)
}
console.log(capitalizeString("Chào mừng bạn đẾn vớI việT nAm"))
//Bài 5
function reverseString(string) {
    return string.split("").reverse().join(" ");
}
console.log(reverseString("Tung"))
//Bài 6
function checkSymmetricString(string) {
    let str = string.toLowerCase().replace(" ", "");
    for (let i = 0; i < str.length / 2; i++) {
        if (str.charAt(i) !== a.charAt(str.length - 1 - i)) {
            return false;
        }
    }
    return true;
}
console.log(checkSymmetricString("Race car"));
console.log(checkSymmetricString("Hello world"));
