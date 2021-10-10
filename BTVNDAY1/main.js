
function checkMark(mark){
    if (mark > 85) {
        console.log("A")
    }if (mark >=75 && mark<85) {
         console.log("B")
    }if (mark >=40 && mark<75) {
       console.log("C")
    }if (mark <40) {
        console.log("D")
    }  
}
checkMark(88);
function dayInWeek (day){
    switch (day) {
        case 0:
            console.log("Chủ nhật")
            break;
            case 1:
                console.log("Thứ 2")
                break;
                case 2:
                    console.log("Thứ 3")
                    break;
                    case 3:
                        console.log("Thứ 4")
                        break;
                        case 4:
                            console.log("Thứ 5")
                            break;
                            case 5:
                                console.log("Thứ 6")
                                break;
                                case 6:
                                    console.log("Thứ 7")
                                    break;
        default:
            break;
    }
}
dayInWeek(5)
function ramdom(min,max){
    return Math.floor(Math.random() * (max - min + 1)) + min;
}
console.log(ramdom(1,6))
function sumOodNumber(){
    let tongle=0;
    let j=0;
    for(i=1;i<100;i++){
        if (i%2!=0) {
            tongle +=i
        }
    }
    console.log(tongle)
}
sumOodNumber()
function sum3and5(){
    let tong=0;
    for(i=0;i<100;i++){
        if (i%3==0 && i%5==0) {
            tong +=i
        }
    }
    console.log(tong)
}
sum3and5()


