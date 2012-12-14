.section .text
    .globl _start

		_start:
		    movl $3, %eax       # use syscall 3 (read) to read from stdin
				    movl $0, %ebx       # reads from stdin (FD 0)
	    movl %edi, %ecx    # store input in register %edi
			    movl $4, %edx       # read one byte
					    int  $0x80      # invoke system call to read from stdin

							    incl %edi          # increment the value we got from stdin

									    movl $4, %eax       # use syscall 4 (write) to print to screen
											    movl $1, %ebx       # print to stdout (FD 1)
	    movl %edi, %ecx    # pointer to text to write out
			    movl $4, %edx       # length of text to write out (1 byte)
	    int  $0x80          # invoke system call to write to stdout

			    movl $1, %eax       # use syscall 1 (exit) to exit
					    movl $0, %ebx       # error code = 0
							    int  $0x80          # invoke system call
