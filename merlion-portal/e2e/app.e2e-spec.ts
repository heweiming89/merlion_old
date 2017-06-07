import { MerlionPortalPage } from './app.po';

describe('merlion-portal App', function() {
  let page: MerlionPortalPage;

  beforeEach(() => {
    page = new MerlionPortalPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
