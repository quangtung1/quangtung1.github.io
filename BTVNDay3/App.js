let grades = [
    { name: "John", grade: 8, sex: "M" },
    { name: "Sarah", grade: 12, sex: "F" },
    { name: "Bob", grade: 16, sex: "M" },
    { name: "Johnny", grade: 2, sex: "M" },
    { name: "Ethan", grade: 4, sex: "M" },
    { name: "Paula", grade: 18, sex: "F" },
    { name: "Donald", grade: 5, sex: "M" },
    { name: "Jennifer", grade: 13, sex: "F" },
    { name: "Courtney", grade: 15, sex: "F" },
    { name: "Jane", grade: 9, sex: "F" },
];

const isMale = (grades) => {
    return grades.filter((ele) => ele.sex === "M");
};
const isFemale = (grades) => {
    return grades.filter((ele) => ele.sex === "F");
};
const avgGrade = (grades) => {
    return grades.reduce((sum, ele) => sum + ele.grade, 0) / grades.length;
};
const isMax = (grades) => {
    return Math.max(...grades.map((std) => std.grade));
};
const isMin = (grades) => {
    return Math.min(...grades.map((std) => std.grade));
};

// 1. Tìm thứ hạng trung bình của cả lớp
console.log(avgGrade(grades));
// 2. Tìm thứ hạng trung bình của nam trong lớp
console.log(avgGrade(isMale(grades)));
// 3. Tìm thứ hạng trung bình của Nữ trong lớp
console.log(avgGrade(isFemale(grades)));

// 4. Tìm thứ hạng cao nhất của Nam trong lớp
console.log(isMax(isMale(grades)));
// 5. Tìm thứ hạng cao nhất của Nữ trong lớp
console.log(isMax(isFemale(grades)));
// 6. Tìm thứ hạng thấp nhất của Nam trong lớp
console.log(isMin(isMale(grades)));
// 7. Tìm thứ hạng thấp nhất của Nữ trong lớp
console.log(isMin(isFemale(grades)));
// 8. Tìm thứ hạng cao nhất của cả lớp
console.log(isMax(grades));
// 9. Tìm thứ hạng thấp nhất của cả lớp
console.log(isMin(grades));
// 10. Lấy ra danh sách tất cả học viên nữ trong lớp
console.log(isFemale(grades));

// 11. Sắp xếp tên học viên theo chiều tăng dần của bảng chữ cái
console.log(grades.sort((a, b) => a.name.localeCompare(b.name)));
// 12. Sắp xếp thứ hạng học viên theo chiều giảm dần
console.log(grades.sort((a, b) => b.grade - a.grade));
// 13. Lấy ra học viên nữ có tên bắt đầu bằng "J"
console.log(isFemale(grades).filter((i) => i.name.indexOf("J") == 0));
// 14. Lấy ra top 5 người có thứ hạng cao nhất
console.log(grades.sort((a, b) => b.grade - a.grade).slice(0, 5));