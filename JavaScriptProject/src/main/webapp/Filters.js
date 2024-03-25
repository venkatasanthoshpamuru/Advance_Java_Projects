const books = [
  { title: 'The Great Gatsby', author: 'F. Scott Fitzgerald', genre: 'Fiction', pages: 180 },
  { title: 'To Kill a Mockingbird', author: 'Harper Lee', genre: 'Fiction', pages: 281 },
  { title: '1984', author: 'George Orwell', genre: 'Dystopian', pages: 328 },
  { title: 'The Catcher in the Rye', author: 'J.D. Salinger', genre: 'Fiction', pages: 224 },
  { title: 'The Hobbit', author: 'J.R.R. Tolkien', genre: 'Fantasy', pages: 310 },
  { title: 'Pride and Prejudice', author: 'Jane Austen', genre: 'Fantasy', pages: 279 },
];

let f1=books.filter(book=>book.genre==="Fiction"+"<br>");
document.write(f1);

let b1=books.filter (book=>book.pages>=250+"<br>");
document.write(b1);

let t1=books.map(book=>book.title+"<br>");
 document.write(t1);

//display only page numbers
let p1=books.map(book=>book.pages+5+"<br>");
document.write(p1);

//display full table
let p2=books.map(book=>{book.pages+5; return book+"<br>";});
console.log(p2);

let fi=books.filter(book=>book.genre==="Fiction");
    books.map (book=>{book.pages=book.pages+5; return book+"<br>"});
document.write(fi);

//let s=books.reduce (sum,book)=> sum+book.pages,0);
