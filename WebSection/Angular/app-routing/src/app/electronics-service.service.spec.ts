import { TestBed } from '@angular/core/testing';

import { ElectronicsServiceService } from './electronics-service.service';

describe('ElectronicsServiceService', () => {
  let service: ElectronicsServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ElectronicsServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
