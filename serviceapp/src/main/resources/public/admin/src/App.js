import React from 'react';
import { Admin, Resource } from 'react-admin';
import jsonServerProvider from 'ra-data-json-server';
import { MessageList, MessageCreate } from './messages';

const dataProvider = jsonServerProvider('http://localhost:8080');
const App = () => (
    <Admin dataProvider={dataProvider}>
        <Resource name="messages" list={MessageList} create={MessageCreate} />
    </Admin>
);

export default App;
