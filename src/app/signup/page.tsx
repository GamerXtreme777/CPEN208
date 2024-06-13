import Image from "next/image";

export default function Home() {
  return (
    <main className="flex min-h-screen flex-col items-center justify-between p-24 bg-gray-100">
     <div className="z-10 w-full max-w-5xl items-center justify-between font-mono text-sm lg:flex">
    <div className="bg-white rounded-4xl shadow-2xl flex w-300 max-w-6xl">
     <div className="w-3/5 p-5>
     <div className="text-left  font-bold>
     <span className="text-green-500  text-3xl">UG</span>
     <div className="py-10 flex flex-col items-center ">
      <h2 className="text-2xl font-bold text-green-500 text-center">Register  Account</h2>
      <div className ="bg-gray-300 w-64 p-5 mt-5 rounded-lg" ><input type="text" name="username" className="bg-gray-300 text-m text-black" placeholder="Username"/></div>
        <div className="  flex flex-col items-center justify-center"></div>
        <div className ="bg-gray-300 w-64 p-5 mt-5 rounded-lg" ><input type="id" name="ID" className="text-black bg-gray-300" placeholder="ID"/></div>
        <div className="  flex flex-col items-center justify-center"></div>
        <div className ="bg-gray-300 w-64 p-5 mt-5 rounded-lg" ><input type="password" name="password"  className="text-black bg-gray-300" placeholder="Password"/></div>
        <div className="  flex flex-col items-center justify-center"></div>
        <a href ="#" className="border-2 border-green-500 rounded-full px-2 py-2 inline-block font-semibold text-black hover:bg-green-500 hover:text-white mt-5">Register</a>


        </div>
      
      <div className="py-50,px-10"></div>
      </div>
      <div className="w-2/5 bg-green-500 text-white rounded-tr-3xl  rounded-br-3xl p-5 py-36 px-12">
      <h2 className = "text-2xl font-bold mb-2">Already have an Account? </h2>
      <div className="border-2 w-10 border-white inline-block mb-2"></div>
      <p className="mb-10">Sign In With Us Today! </p>
      <a href ="./signup" className="border-2 border-white rounded-full px-2 py-2 inline-block font-semibold hover:bg-black hover:text-white">Sign In</a>
      </div>
      </div>
      </div>
    </main>
  )
};
