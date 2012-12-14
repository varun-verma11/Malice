	.file	"/tmp/webcompile/_5465_0.bc"
	.text
	.globl	main
	.align	16, 0x90
	.type	main,@function
main:                                   # @main
	.Ltmp1:
	.cfi_startproc
# BB#0:
	subq	$24, %rsp
.Ltmp2:
	.cfi_def_cfa_offset 32
	movl	$0, 20(%rsp)
	movl	$1, 16(%rsp)
	movl	$3, 12(%rsp)
	movl	16(%rsp), %eax
	addl	12(%rsp), %eax
	movl	%eax, 8(%rsp)
	movslq	8(%rsp), %rdi
	movb	$0, %al
	callq	printf
	movl	20(%rsp), %ecx
	movl	%eax, 4(%rsp)           # 4-byte Spill
	movl	%ecx, %eax
	addq	$24, %rsp
	ret
.Ltmp3:
	.size	main, .Ltmp3-main
.Ltmp4:
	.cfi_endproc
.Leh_func_end0:
.section	".note.GNU-stack","",@progbits
