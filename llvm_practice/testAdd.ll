define i32 @main() nounwind uwtable {
	  %1 = alloca i32, align 4
	  %x = alloca i32, align 4
	  %y = alloca i32, align 4
	  %z = alloca i32, align 4
	  store i32 0, i32* %1
	  store i32 1, i32* %x, align 4
	  store i32 3, i32* %y, align 4
	  %2 = load i32* %x, align 4
	  %3 = load i32* %y, align 4
	  %4 = add nsw i32 %2, %3
	  store i32 %4, i32* %z, align 4
	  %5 = load i32* %z, align 4
	  %6 = sext i32 %5 to i64
	  %7 = inttoptr i64 %6 to i8*
	  %8 = call i32 (i8*, ...)* @printf(i8* %7)
		%9 = load i32* %1
	  ret i32 %9
}

declare i32 @printf(i8*, ...)
