import React from "react";
import UserForm from "./UserForm";
import UserList from "./UserList";

const App = () => {
  const refreshUsers = () => {
    window.location.reload();
  };

  return (
    <div>
      <UserForm onUserAdded={refreshUsers} />
      <div>
        <UserList />
      </div>
    </div>
  );
};

export default App;
