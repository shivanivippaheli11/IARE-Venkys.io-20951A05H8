import threading

def reverse_word(words, i):
    words[i] = words[i][::-1]

def reverse_words(paragraph):
    words = paragraph.split()
    threads = []
    for i in range(len(words)):
        t = threading.Thread(target=reverse_word, args=(words, i))
        threads.append(t)
        t.start()
    for t in threads:
        t.join()
    return ' '.join(words)

paragraph = input('Enter the paragraph: ')
reversed_paragraph = reverse_words(paragraph)
print(reversed_paragraph)
